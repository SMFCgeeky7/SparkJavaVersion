package com.example.spark.views.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.example.spark.R;

public class CheckoutFormBottomSheet extends AppCompatDialogFragment {

    @NonNull
    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        // Inflar el layout del diálogo
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_checkout_form, null);

        // Configurar el título del diálogo
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setView(view);

        // Obtener referencias a los elementos del layout
        EditText etNombre = view.findViewById(R.id.et_nombre);
        EditText etApellidos = view.findViewById(R.id.et_apellidos);
        EditText etDireccion = view.findViewById(R.id.et_direccion);
        EditText etCiudad = view.findViewById(R.id.et_ciudad);
        EditText etPais = view.findViewById(R.id.et_pais);
        Button btnAceptar = view.findViewById(R.id.btn_aceptar);

        // Configurar el botón "Aceptar"
        btnAceptar.setOnClickListener(v -> {
            // Aquí puedes validar los datos y realizar la acción necesaria
            String nombre = etNombre.getText().toString();
            String apellidos = etApellidos.getText().toString();
            String direccion = etDireccion.getText().toString();
            String ciudad = etCiudad.getText().toString();
            String pais = etPais.getText().toString();

            // Ejemplo de validación simple
            if (nombre.isEmpty() || apellidos.isEmpty() || direccion.isEmpty() || ciudad.isEmpty() || pais.isEmpty()) {
                // Mostrar mensaje de error
                // ...
            } else {
                // Procesar la información ingresada
                dismiss(); // Cerrar el diálogo
            }
        });

        return builder.create();
    }
}

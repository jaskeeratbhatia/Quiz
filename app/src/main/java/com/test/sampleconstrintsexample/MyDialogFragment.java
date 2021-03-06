package com.test.sampleconstrintsexample;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class MyDialogFragment extends DialogFragment implements DialogInterface.OnClickListener
{

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder b = new AlertDialog.Builder(getActivity())
                .setTitle("Welcome!!!")
                .setPositiveButton("Ok", this)
                .setNegativeButton("Cancel", this)
                .setMessage("Hello Dialog!!!!!");
        return b.create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which)
    {
        switch (which)
        {
            case Dialog.BUTTON_POSITIVE:
                Toast.makeText(getActivity(),"OK",Toast.LENGTH_SHORT).show();
                break;

            case DialogInterface.BUTTON_NEGATIVE:
                Toast.makeText(getActivity(),"Cancel",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

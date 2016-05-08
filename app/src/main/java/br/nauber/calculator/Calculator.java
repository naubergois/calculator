package br.nauber.calculator;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Calculator extends AppCompatActivity {

    Button plus;
    Button minus;
    Button multiply;
    Button division;
    Button clr;

    EditText operand1;
    EditText operand2;
    TextView result;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    public Activity returnActivity() {
        return this;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button division = (Button) findViewById(R.id.divisionbutton);
        Button plus = (Button) findViewById(R.id.plusbutton);
        Button multiply = (Button) findViewById(R.id.multiplybutton);
        Button minus = (Button) findViewById(R.id.minusbutton);
        Button clr = (Button) findViewById(R.id.button);
        final EditText operand1 = (EditText) findViewById(R.id.editText);
        final EditText operand2 = (EditText) findViewById(R.id.editText2);
        final TextView result = (TextView) findViewById(R.id.textView3);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = 0;
                double number2 = 0;
                if (operand1 != null) {
                    if (operand1.getText().length() > 0)
                        number1 = Double.valueOf(operand1.getText().toString());
                    else
                        Toast.makeText(returnActivity(), "Operand 1 need to be a number", Toast.LENGTH_LONG).show();

                }
                if (operand2 != null) {
                    if (operand2.getText().length() > 0)
                        number2 = Double.valueOf(operand2.getText().toString());
                    else
                        Toast.makeText(returnActivity(), "Operand 2 need to be a number", Toast.LENGTH_LONG).show();

                }
                double sum = number1 + number2;

                if (result != null) {
                    result.setText(String.valueOf(sum));
                }

            }
        });

        assert clr != null;
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                result.setText("");

            }

        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = 0;
                double number2 = 0;
                if (operand1 != null) {
                    if (operand1.getText().length() > 0)
                        number1 = Double.valueOf(operand1.getText().toString());
                    else
                        Toast.makeText(returnActivity(), "Operand1 need to be a number", Toast.LENGTH_LONG).show();


                }
                if (operand2 != null) {
                    if (operand2.getText().length() > 0)
                        number2 = Double.valueOf(operand2.getText().toString());
                    else
                        Toast.makeText(returnActivity(), "Operand 2 need to be a number", Toast.LENGTH_LONG).show();

                }
                double sum = number1 - number2;

                if (result != null) {
                    result.setText(String.valueOf(sum));
                }

            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = 0;
                double number2 = 0;
                if (operand1 != null) {
                    if (operand1.getText().length() > 0)
                        number1 = Double.valueOf(operand1.getText().toString());
                    else
                        Toast.makeText(returnActivity(), "Operand1 need to be a number", Toast.LENGTH_LONG).show();


                }
                if (operand2 != null) {
                    if (operand2.getText().length() > 0)
                        number2 = Double.valueOf(operand2.getText().toString());
                    else
                        Toast.makeText(returnActivity(), "Operand 2 need to be a number", Toast.LENGTH_LONG).show();
                }
                double sum = number1 * number2;

                if (result != null) {
                    result.setText(String.valueOf(sum));
                }

            }
        });

        division.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            double number1 = 0;
                                            double number2 = 0;
                                            if (operand1 != null) {
                                                if (operand1.getText().length() > 0)
                                                    number1 = Double.valueOf(operand1.getText().toString());
                                                else
                                                    Toast.makeText(returnActivity(), "Operand1 need to be a number", Toast.LENGTH_LONG).show();
                                            }


                                            if (operand2 != null)

                                            {
                                                if (operand2.getText().length() > 0)
                                                    number2 = Double.valueOf(operand2.getText().toString());
                                                else
                                                    Toast.makeText(returnActivity(), "Operand 2 need to be a number", Toast.LENGTH_LONG).show();
                                            }

                                            double sum = number1 / number2;

                                            if (result != null)

                                            {
                                                result.setText(String.valueOf(sum));
                                            }

                                        }
                                    }

        );

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Calculator Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://br.nauber.calculator/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Calculator Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://br.nauber.calculator/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}

package user.app.login;

import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnRegister);
        EditText usernameField = findViewById(R.id.edittext1);
        EditText emailField = findViewById(R.id.edittext2);
        EditText contactField = findViewById(R.id.edittext3);
        EditText passwordField = findViewById(R.id.edittext4);
        EditText confirmField = findViewById(R.id.edittext5);

        button.setOnClickListener(v ->
        {
            String Username = usernameField.getText().toString().trim();
            String Email = emailField.getText().toString().trim();
            String Contact = contactField.getText().toString().trim();
            String Password = passwordField.getText().toString().trim();
            String Confirm = confirmField.getText().toString().trim();

            if(Username.isEmpty() || Email.isEmpty() || Contact.isEmpty() || Password.isEmpty() || Confirm.isEmpty())
            {
                Toast.makeText(MainActivity.this,"Please fill in all fields!",Toast.LENGTH_SHORT).show();
            }
            else if (!Password.equals(Confirm))
            {
                Toast.makeText(MainActivity.this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Registration Successful!",Toast.LENGTH_LONG).show();
            }
        });
    }
}
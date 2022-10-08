package vik.com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CMainActivity : AppCompatActivity()
{
    val obj = CObject("VIK",25)

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cmain)
        println("Hello")

        val button : Button = findViewById(R.id.button)
        val editTextInput: EditText = findViewById(R.id.editTextInput)

//        editTextInput.setText("new comment")
        button.setOnClickListener {

            obj.comments.add(editTextInput.text.toString())
            editTextInput.setText("")
//            editTextInput.setText("123")
//            val obj = CObject("VIK",25)
//            obj.comments.add("first comment")

            Toast.makeText(applicationContext, "-> ${obj.comments.size}", Toast.LENGTH_SHORT).show()

        }
        val button2 : Button = findViewById(R.id.button2)
        val textView: TextView = findViewById(R.id.textView)
        button2.setOnClickListener {

            textView.setText("")
            textView.append(obj.toString())
            textView.append("\n")
            for (Item in obj.comments) {
                textView.append(Item)
                textView.append("\n")
            }

        }
        val button3 : Button = findViewById(R.id.button3)
        button3.setOnClickListener {

            textView.setText("")

        }
    }
}
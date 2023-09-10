package lotsu.alfred.databindingbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import lotsu.alfred.databindingbasics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val submitButton = binding.submitButton
        submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        val nameTextView = binding.nameText
        val nameText = binding.nameInput.text
        nameTextView.text = "Hello, ${nameText}"

    }
}
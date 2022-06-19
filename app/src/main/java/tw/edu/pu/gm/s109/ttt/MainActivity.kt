package tw.edu.pu.gm.s109.ttt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

var singleUser =false
class MainActivity : AppCompatActivity() {

    lateinit var singPlayerBtn :Button
    lateinit var multiPlayerBtn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        singPlayerBtn =findViewById(R.id.idBtnSinglePlayer)
        multiPlayerBtn=findViewById(R.id.idBtnMultiPlayer)
        singPlayerBtn.setOnClickListener{
            singleUser = true
            startActivity(Intent(this,GamePlayActivity::class.java))

        }

        multiPlayerBtn.setOnClickListener {
            singleUser = false
            startActivity(Intent(this,GamePlayActivity::class.java))
        }

    }
}
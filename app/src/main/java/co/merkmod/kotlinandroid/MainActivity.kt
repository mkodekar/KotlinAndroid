package co.merkmod.kotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import co.merkmod.kotlinandroid.dataclass.People
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val exapleTextview: TextView = findViewById(R.id.example) as TextView
        val people: People = People(1, "Rehan Kodekar", "Bhendi bazar", "Mumbai")
        val people1: People = People(2, "Santos Gaikar", "Antop hill", "Mumbai")
        val people2: People = People(3, "Pritesh Chavakar", "Worli", "Mumbai")
        val peoples: ArrayList<People> = ArrayList()
        peoples.add(people)
        peoples.add(people1)
        peoples.add(people2)
        for ((id, name, address, city) in peoples) {
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
            exapleTextview.text = address
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }
}

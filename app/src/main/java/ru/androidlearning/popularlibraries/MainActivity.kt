package ru.androidlearning.popularlibraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.androidlearning.popularlibraries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView  {
    private lateinit var viewBinding: ActivityMainBinding
    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.btnCounter1.setOnClickListener { presenter.button1Click() }
        viewBinding.btnCounter2.setOnClickListener { presenter.button2Click() }
        viewBinding.btnCounter3.setOnClickListener { presenter.button3Click() }
    }

    override fun setButtonOneText(text: String) {
        viewBinding.btnCounter1.text = text
    }

    override fun setButtonTwoText(text: String) {
        viewBinding.btnCounter2.text = text
    }

    override fun setButtonThreeText(text: String) {
        viewBinding.btnCounter3.text = text
    }
}

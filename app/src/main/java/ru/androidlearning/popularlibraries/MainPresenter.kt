package ru.androidlearning.popularlibraries

class MainPresenter(private val view: MainView, private val model: CountersModel) {

    fun button1Click() {
        val nextValue = model.next(0)
        view.showCounterOne(nextValue.toString())
    }

    fun button2Click() {
        val nextValue = model.next(1)
        view.showCounterTwo(nextValue.toString())
    }

    fun button3Click() {
        val nextValue = model.next(2)
        view.showCounterThree(nextValue.toString())
    }
}

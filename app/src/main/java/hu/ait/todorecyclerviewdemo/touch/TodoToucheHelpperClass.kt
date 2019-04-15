package hu.ait.todorecyclerviewdemo.touch

interface TodoToucheHelpperClass {

    fun onDismissed(position: Int)
    fun onItemMoved(fromPosition: Int, toPosition: Int)
}
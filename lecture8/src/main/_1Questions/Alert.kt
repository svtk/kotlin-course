package _1Questions

fun Context.showAreYouSureAlert(process: () -> Unit) {
    alert(title = "Are you sure?", message = "Are you really sure?") {
        positiveButton("Yes") { process() }
        negativeButton("No") { }
    }.show()
}

fun Context.alert(
        message: String,
        title: String? = null,
        init: (AlertDialogBuilder.() -> Unit)? = null
): AlertDialogBuilder {
    return AlertDialogBuilder(this).apply {
        message(message)
        if (title != null) title(title)
        if (init != null) init()
    }
}

/* android framework */

class Context

class DialogInterface {
    fun dismiss() {
    }
}

/* anko - extensions for android */

class AlertDialogBuilder(val ctx: Context) {

    fun title(title: CharSequence) {
    }

    fun message(title: CharSequence) {
    }

    fun positiveButton(title: String, f: DialogInterface.() -> Unit) {
    }

    fun negativeButton(title: String, f: DialogInterface.() -> Unit = { dismiss() }) {
    }

    fun show() {
    }
}
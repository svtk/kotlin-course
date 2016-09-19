package leftovers

data class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
                "Cannot save user ${user.id}: Name is empty")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
                "Cannot save user ${user.id}: Address is empty")
    }

    // Save user to the database
}

fun saveUserV2(user: User) {
    // local function:
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                    "Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    // Save user to the database
}
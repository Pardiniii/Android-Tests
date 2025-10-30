import androidx.lifecycle.ViewModel

class UserViewModel(private val repository: UserRepository) : ViewModel() {
    fun fetchUsers(): List<String> {
        return repository.getUsers()
    }
}
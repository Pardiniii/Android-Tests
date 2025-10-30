package com.example.teste.integracao

import UserRepository
import UserViewModel
import com.example.teste.repository.UserRepositoryImpl
import org.junit.Test
import kotlin.test.assertEquals

class UserViewModelIntegrationTest {

    @Test
    fun shouldReturnUserListFromRepository() {
        val repo = UserRepositoryImpl()
        val viewModel = UserViewModel(repo)

        val usuarios = viewModel.fetchUsers()

        assertEquals(listOf("Alice", "Bob", "Charlie"), usuarios)
    }
}
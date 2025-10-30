package com.example.teste.repository

import UserRepository

class UserRepositoryImpl : UserRepository
{
    override fun getUsers(): List<String> {
        return listOf("Alice", "Bob", "Charlie")
    }
}
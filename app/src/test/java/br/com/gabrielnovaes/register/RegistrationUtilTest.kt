package br.com.gabrielnovaes.register

import com.google.common.truth.Truth
import org.junit.Assert
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validRegistrationInput("Gabriel","1232","1232")
        Assert.assertEquals(true,result)
    }

    @Test
    fun `empty username return false`(){
        val result = RegistrationUtil.validRegistrationInput("","123","123")
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `username already taken return false `(){
        val result = RegistrationUtil.validRegistrationInput("Rahul","123","123")
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `incorrect confirm password return false`(){
        val result = RegistrationUtil.validRegistrationInput("Rahul","123","1234")
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun `incorrect informed password return false`(){
        val result = RegistrationUtil.validRegistrationInput("Rahul","1234","1235")
        Truth.assertThat(result).isFalse()
    }

}
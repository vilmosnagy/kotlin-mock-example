package com.github.vilmosnagy.kotlin.mockexample

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class FooTest {

    @Test
    fun should_mock() {
        val foo: Foo = mock()
        whenever(foo.message).thenReturn("Hello, world")
        println(foo.message)

        assertEquals("Hello, world", foo.message)
    }
}
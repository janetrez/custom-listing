package org.example

data class BaseNode<T>(
    val value: T,
    val next: BaseNode<T>?
) {

}

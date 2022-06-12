package com.example.mig_besok.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction

class VisitorComponents {
    @Composable
    fun VisitorInpitText (
        modifier: Modifier = Modifier,
        text: String,
        lable: String,
        maxLine: Int = 1,
        onTextChange: (String) -> Unit,
        onImeAction: () -> Unit ={}){

        val keyboardController : LocalSoftwareKeyboardController.current

    }
}
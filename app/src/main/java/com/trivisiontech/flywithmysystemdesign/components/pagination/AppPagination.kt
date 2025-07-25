package com.trivisiontech.flywithmysystemdesign.components.pagination

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trivisiontech.flywithmysystemdesign.ui.theme.AppTheme

@Composable
fun AppPagination(
    currentPage: Int,
    totalPages: Int,
    onPageChange: (Int) -> Unit
) {
    Row(modifier = Modifier.padding(8.dp)) {
        Button(
            onClick = { if (currentPage > 1) onPageChange(currentPage - 1) },
            enabled = currentPage > 1
        ) {
            Text("Previous")
        }
        for (page in 1..totalPages) {
            Button(
                onClick = { onPageChange(page) },
                enabled = page != currentPage,
                modifier = Modifier.padding(horizontal = 4.dp)
            ) {
                Text(page.toString())
            }
        }
        Button(
            onClick = { if (currentPage < totalPages) onPageChange(currentPage + 1) },
            enabled = currentPage < totalPages
        ) {
            Text("Next")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAppPagination() {
    AppTheme {
        var currentPage by remember { mutableStateOf(1) }
        AppPagination(
            currentPage = currentPage,
            totalPages = 5,
            onPageChange = { currentPage = it })
    }
}
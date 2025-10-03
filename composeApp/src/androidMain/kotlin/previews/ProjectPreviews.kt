package previews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ve.oscargnu.projectmultiplataforma.ui.AllExpensesHeader
import com.ve.oscargnu.projectmultiplataforma.ui.ExpensesTotalHeader

@Preview(showBackground = true)
@Composable
fun ExpensesTotalHeaderPreview(){
    Box(modifier = Modifier.padding(16.dp)) {
        ExpensesTotalHeader(total = 1082.9)
    }
}

@Preview(showBackground = true)
@Composable
fun AllExpensesHeaderPreview(){
    Box(modifier = Modifier.padding(16.dp)) {
        AllExpensesHeader()
    }
}
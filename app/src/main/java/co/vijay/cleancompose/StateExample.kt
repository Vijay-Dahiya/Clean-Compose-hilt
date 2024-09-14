package co.vijay.cleancompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun NotificationScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        // adding this variable here instead of the fun where it is needed is called State Hoisting
        val count = rememberSaveable { mutableIntStateOf(0) }
        NotificationCounter(count.intValue) { count.intValue++ }
        MessageBar(count.intValue)
    }
}

@Composable
fun MessageBar(count: Int) {
    Card(elevation = CardDefaults.cardElevation(4.dp)) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(imageVector = Icons.Outlined.Favorite, contentDescription = "", modifier = Modifier.padding(4.dp))
            Text(text = "Message sent so far - $count")
        }

    }
}

@Composable
fun NotificationCounter(count: Int, increase: () -> Unit) {
    Column {
        Text(text = "You have sent $count notification")
    }
    Button(onClick = {
        increase()
    }) {
        Text(text = "Send Notification")
    }
}
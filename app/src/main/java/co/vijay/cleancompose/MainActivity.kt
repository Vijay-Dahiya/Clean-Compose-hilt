package co.vijay.cleancompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.vijay.cleancompose.ui.theme.CleanComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            PreviewFun()

//            RecyclerViewCategory()
            NotificationScreen()
        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun PreviewFun() {
    Column {
        ListViewItem(imageId = R.drawable.ic_launcher_background, name = "John Doe", occupation = "Software Developer")
        ListViewItem(imageId = R.drawable.ic_launcher_background, name = "John Doe", occupation = "Software Developer")
        ListViewItem(imageId = R.drawable.ic_launcher_background, name = "John Doe", occupation = "Software Developer")
        ListViewItem(imageId = R.drawable.ic_launcher_background, name = "John Doe", occupation = "Software Developer")

    }
}

@Composable
fun ListViewItem(imageId : Int, name : String, occupation : String) {
    Row(modifier = Modifier.padding(8.dp)) {
        Image(painter = painterResource(id = imageId), contentDescription ="", modifier = Modifier.size(40.dp) )
        Column(modifier = Modifier.padding(horizontal = 8.dp)) {
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(text = occupation, fontWeight = FontWeight.Thin)
        }
    }
}
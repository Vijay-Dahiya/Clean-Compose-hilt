package co.vijay.cleancompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(widthDp = 300, heightDp = 500)
@Composable
fun RecyclerViewCategory(){
    // it will populate all data at once
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCategoryList().map { item ->
//            BlogCategory(img = item.img, title = item.tittle, subtitle = item.subtitle)
//        }
//    }

    // it will populate data as recycler view
    LazyColumn {
        items(getCategoryList()) { item ->
            BlogCategory(img = item.img, title = item.tittle , subtitle = item.subtitle)
        }
    }
}


@Composable
fun BlogCategory(img : Int, title : String, subtitle : String) {

    Card(modifier = Modifier.padding(8.dp), elevation = CardDefaults.cardElevation(8.dp)) {

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, modifier = Modifier.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
            style = MaterialTheme.typography.bodySmall
        )
    }
}

data class Category(val img : Int, val tittle : String, val subtitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    list.add(Category(R.drawable.ic_launcher_foreground, "Programming", "Learn Diff diff Languages"))
    return list
}
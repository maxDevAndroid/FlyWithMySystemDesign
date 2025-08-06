package com.trivisiontech.icons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.sharp.Favorite
import androidx.compose.material.icons.sharp.Home
import androidx.compose.material.icons.sharp.Person
import androidx.compose.material.icons.sharp.Settings
import androidx.compose.material.icons.twotone.Favorite
import androidx.compose.material.icons.twotone.Home
import androidx.compose.material.icons.twotone.Person
import androidx.compose.material.icons.twotone.Settings
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

object AppFilledIcons {
    val Home: ImageVector = Icons.Filled.Home
    val Settings: ImageVector = Icons.Filled.Settings
    val Person: ImageVector = Icons.Filled.Person
    val Info: ImageVector = Icons.Filled.Info
    val Phone: ImageVector = Icons.Filled.Phone
    val Email: ImageVector = Icons.Filled.Email
    val Favorite: ImageVector = Icons.Filled.Favorite
    val Search: ImageVector = Icons.Filled.Search
    val ArrowBack: ImageVector = Icons.AutoMirrored.Filled.ArrowBack
    val ShoppingCart: ImageVector = Icons.Filled.ShoppingCart
}

@Preview
@Composable
fun PreviewIconFilledHome() {
    Icon(AppFilledIcons.Home, contentDescription = "Home")
    Icon(AppFilledIcons.Settings, contentDescription = "Settings")
    Icon(AppFilledIcons.Person, contentDescription = "Person")
}


object AppOutlinedIcons {
    val HomeOutline: ImageVector = Icons.Outlined.Home
    val SettingsOutline: ImageVector = Icons.Outlined.Settings
    val PersonOutline: ImageVector = Icons.Outlined.Person
    val InfoOutline: ImageVector = Icons.Outlined.Info
    val PhoneOutline: ImageVector = Icons.Outlined.Phone
    val EmailOutline: ImageVector = Icons.Outlined.Email
    val FavoriteOutline: ImageVector = Icons.Outlined.FavoriteBorder
    val SearchOutline: ImageVector = Icons.Outlined.Search
    val ArrowBackOutline: ImageVector = Icons.AutoMirrored.Outlined.ArrowBack
    val ShoppingCartOutline: ImageVector = Icons.Outlined.ShoppingCart
}

@Preview
@Composable
fun PreviewOutlinedIconsHome() {
    Icon(AppOutlinedIcons.HomeOutline, contentDescription = "Home")
    Icon(AppOutlinedIcons.SettingsOutline, contentDescription = "SettingsOutline")
    Icon(AppOutlinedIcons.PersonOutline, contentDescription = "PersonOutline")
}

object AppRoundedIcons {
    val HomeRounded: ImageVector = Icons.Rounded.Home
    val SettingsRounded: ImageVector = Icons.Rounded.Settings
    val PersonRounded: ImageVector = Icons.Rounded.Person
    val FavoriteRounded: ImageVector = Icons.Rounded.Favorite
    val ShoppingCartRounded: ImageVector = Icons.Rounded.ShoppingCart
}

@Preview
@Composable
fun PreviewRoundedIconsHome() {
    Icon(AppRoundedIcons.HomeRounded, contentDescription = "Home")
    Icon(AppRoundedIcons.SettingsRounded, contentDescription = "SettingsRounded")
    Icon(AppRoundedIcons.PersonRounded, contentDescription = "PersonRounded")
}

object AppSharpIcons {
    val HomeSharp: ImageVector = Icons.Sharp.Home
    val SettingsSharp: ImageVector = Icons.Sharp.Settings
    val PersonSharp: ImageVector = Icons.Sharp.Person
    val FavoriteSharp: ImageVector = Icons.Sharp.Favorite
}

@Preview
@Composable
fun PreviewSharpIconsHome() {
    Icon(AppSharpIcons.HomeSharp, contentDescription = "Home")
    Icon(AppSharpIcons.SettingsSharp, contentDescription = "SettingsSharp")
    Icon(AppSharpIcons.PersonSharp, contentDescription = "PersonSharp")
}

object AppTwoToneIcons {
    val HomeTwoTone: ImageVector = Icons.TwoTone.Home
    val SettingsTwoTone: ImageVector = Icons.TwoTone.Settings
    val PersonTwoTone: ImageVector = Icons.TwoTone.Person
    val FavoriteTwoTone: ImageVector = Icons.TwoTone.Favorite
}

@Preview
@Composable
fun PreviewTwoToneIconsHome() {
    Icon(AppTwoToneIcons.HomeTwoTone, contentDescription = "Home")
    Icon(AppTwoToneIcons.SettingsTwoTone, contentDescription = "SettingsTwoTone")
    Icon(AppTwoToneIcons.PersonTwoTone, contentDescription = "PersonTwoTone")
}

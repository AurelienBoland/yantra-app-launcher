package com.coderGtm.yantra

import android.graphics.Color
import com.coderGtm.yantra.models.Theme

enum class Themes(val theme: Theme) {
    Default(
        Theme(
            bgColor = 0xFF121212.toInt(),
            commandColor = 0xFFA0A0A0.toInt(),
            suggestionTextColor = 0xFFE1BEE7.toInt(),
            buttonColor = 0xFFFAEBD7.toInt(),
            resultTextColor = 0xFFEBEBEB.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Light(
        Theme(
            bgColor = 0xFFFFFFFF.toInt(),
            commandColor = 0xFF000000.toInt(),
            suggestionTextColor = 0xFF000000.toInt(),
            buttonColor = 0xFF000000.toInt(),
            resultTextColor = 0xFF000000.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Hacker(
        Theme(
            bgColor = 0xFF000000.toInt(),
            commandColor = 0xFF00FF00.toInt(),
            suggestionTextColor = 0xFFFF0000.toInt(),
            buttonColor = 0xFFFFFF00.toInt(),
            resultTextColor = 0xFF00C855.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Ocean(
        Theme(
            bgColor = 0xFF2B303B.toInt(),
            commandColor = 0xFF00E5FF.toInt(),
            suggestionTextColor = 0xFF00E5FF.toInt(),
            buttonColor = 0xFF00E5FF.toInt(),
            resultTextColor = 0xFF00E5FF.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Gruvbox(
        Theme(
            bgColor = 0xFF282828.toInt(),
            commandColor = 0xFFEBDBB2.toInt(),
            suggestionTextColor = 0xFFEBDBB2.toInt(),
            buttonColor = 0xFFEBDBB2.toInt(),
            resultTextColor = 0xFFEBDBB2.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Material(
        Theme(
            bgColor = 0xFF191919.toInt(),
            commandColor = 0xFFFFFFFF.toInt(),
            suggestionTextColor = 0xFFFFFFFF.toInt(),
            buttonColor = 0xFFFFFFFF.toInt(),
            resultTextColor = 0xFFFFFFFF.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Dark(
        Theme(
            bgColor = 0xFF000000.toInt(),
            commandColor = 0xFFA0A0A0.toInt(),
            suggestionTextColor = 0xFFE1BEE7.toInt(),
            buttonColor = 0xFFFAEBD7.toInt(),
            resultTextColor = 0xFFEBEBEB.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Solarized(
        Theme(
            bgColor = 0xFF002B36.toInt(),
            commandColor = 0xFF839496.toInt(),
            suggestionTextColor = 0xFF268BD2.toInt(),
            buttonColor = 0xFFB58900.toInt(),
            resultTextColor = 0xFFfdf6e3.toInt(),
            errorTextColor = 0xFFDC322F.toInt(),
            successTextColor = 0xFF859900.toInt(),
            warningTextColor = 0xFFB58900.toInt()
        )
    ),
    Dracula(
        Theme(
            bgColor = 0xFF282A36.toInt(),
            commandColor = 0xFFF8F8F2.toInt(),
            suggestionTextColor = 0xFF50FA7B.toInt(),
            buttonColor = 0xFF6272A4.toInt(),
            resultTextColor = 0xFFF8F8F2.toInt(),
            errorTextColor = 0xFFFF5555.toInt(),
            successTextColor = 0xFF50FA7B.toInt(),
            warningTextColor = 0xFFFFB86C.toInt()
        )
    ),
    Monokai(
        Theme(
            bgColor = 0xFF272822.toInt(),
            commandColor = 0xFFF8F8F2.toInt(),
            suggestionTextColor = 0xFF66D9EF.toInt(),
            buttonColor = 0xFFAE81FF.toInt(),
            resultTextColor = 0xFFF8F8F2.toInt(),
            errorTextColor = 0xFFFF5555.toInt(),
            successTextColor = 0xFF50FA7B.toInt(),
            warningTextColor = 0xFFFFB86C.toInt()
        )
    ),
    Green(
        Theme(
            bgColor = 0xFF000000.toInt(),
            commandColor = 0xFF00FF00.toInt(),
            suggestionTextColor = 0xFF00FF00.toInt(),
            buttonColor = 0xFF00FF00.toInt(),
            resultTextColor = 0xFF00FF00.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Red(
        Theme(
            bgColor = 0xFF000000.toInt(),
            commandColor = 0xFFFF0000.toInt(),
            suggestionTextColor = 0xFFFF0000.toInt(),
            buttonColor = 0xFFFF0000.toInt(),
            resultTextColor = 0xFFFF0000.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Blue(
        Theme(
            bgColor = 0xFF000000.toInt(),
            commandColor = 0xFF0000FF.toInt(),
            suggestionTextColor = 0xFF0000FF.toInt(),
            buttonColor = 0xFF0000FF.toInt(),
            resultTextColor = 0xFF0000FF.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Yellow(
        Theme(
            bgColor = 0xFF000000.toInt(),
            commandColor = 0xFFFFFF00.toInt(),
            suggestionTextColor = 0xFFFFFF00.toInt(),
            buttonColor = 0xFFFFFF00.toInt(),
            resultTextColor = 0xFFFFFF00.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Purple(
        Theme(
            bgColor = 0xFF000000.toInt(),
            commandColor = 0xFF800080.toInt(),
            suggestionTextColor = 0xFF800080.toInt(),
            buttonColor = 0xFF800080.toInt(),
            resultTextColor = 0xFF800080.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt()
        )
    ),
    Orange(
        Theme(
            bgColor = 0xFF000000.toInt(),
            commandColor = 0xFFFFA500.toInt(),
            suggestionTextColor = 0xFFFFA500.toInt(),
            buttonColor = 0xFFFFA500.toInt(),
            resultTextColor = 0xFFFFA500.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt(),
        )
    ),
    Pink(
        Theme(
            bgColor = 0xFF000000.toInt(),
            commandColor = 0xFFFFC0CB.toInt(),
            suggestionTextColor = 0xFFFFC0CB.toInt(),
            buttonColor = 0xFFFFC0CB.toInt(),
            resultTextColor = 0xFFFFC0CB.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFFFD600.toInt(),
        )
    ),
    Ubuntu(
        Theme(
            bgColor = 0xFF300A24.toInt(),
            commandColor = 0xFFE95420.toInt(),
            suggestionTextColor = 0xFFE95420.toInt(),
            buttonColor = 0xFFE95420.toInt(),
            resultTextColor = 0xFFE95420.toInt(),
            errorTextColor = 0xFFF00000.toInt(),
            successTextColor = 0xFF00C853.toInt(),
            warningTextColor = 0xFFE95420.toInt(),
        )
    ),
}
enum class AppSortMode(val value: Int) {
    A_TO_Z(0),
    RECENT(1),
    MOST_USED(2)
}
enum class ActivityRequestCodes(val code: Int) {
    IMAGE_PICK(0)
}
enum class PermissionRequestCodes(val code: Int) {
    STORAGE(200),
    CALL(300),
    CONTACTS(400),
    BLUETOOTH(500),
    NOTIFICATIONS(600),
    TERMUX_RUN_COMMAND(700),
}
enum class UserNotificationChannelConfig(val value: String) {
    NAME("User Generated Notifications"),
    DESCRIPTION("This channel is for Notifications fired by user using the 'notify' command."),
    ID("userNotifications")
}

const val SHARED_PREFS_FILE_NAME = "yantraSP"
const val DEFAULT_TERMINAL_FONT_NAME = "Source Code Pro"
const val USER_NOTIFICATION_ID = 101
const val AI_SYSTEM_PROMPT = "Friendly, warm, and farcical. You must always be extremely concise. If the user is chatting casually, your responses must be less than 1 sentence, sometimes just a word or two. If the user needs help, disregard the length restriction, and answer technical or knowledge-based questions with useful details and reasoning. If insulted, respond with a similar insult. Communicate responses in lowercase without punctuation, similar to the style used in chat rooms. Use Unicode emoji rarely."
const val DISCORD_COMMUNITY_URL = "https://discord.gg/sRZUG8rPjk"

val NO_LOG_COMMANDS = listOf("sleep", "echo", "notify")
package com.coderGtm.yantra

class Constants {
    val debugMode = false
    val themeList = arrayOf("Default","Light","Hacker","Ocean","Gruvbox","Material","Dark","Solarized","Dracula","Monokai","Green","Red","Blue","Yellow","Purple","Orange","Pink","Ubuntu")
    val primarySuggestions = arrayListOf("open", "help", "community", "list", "quote", "info", "lock", "battery", "time", "weather", "scripts", "run", "ai", "bored", "news", "google", "ddg", "brave", "gupt", "call", "text", "email", "flash", "bluetooth", "uninstall", "init", "todo", "alias", "unalias", "echo", "notify", "calc", "termux", "tts", "username", "theme", "bg", "sleep", "vibe", "clear", "reset", "sysinfo", "openf", "infof", "settings", "fontpack", "cmdrequest", "feedback", "exit")
    val helpArray = listOf("open","openf","list","username","call","theme","bg","text","email","flash","bluetooth","calc","google","ddg","brave","gupt","weather","ai","bored","news","uninstall","info","infof","settings", "sysinfo","lock","quote","battery","time","init","todo","scripts","run","alias","unalias", "echo", "notify", "termux","clear","reset","tts","sleep","vibe","fontpack","help","cmdrequest","exit","community","feedback")
    val helpDescriptionArray = arrayListOf(arrayListOf("open [app name]","Opens specified app. Example: open Chrome"),arrayListOf("list [component]","Lists specified component [apps/themes/contacts]."),arrayListOf("username [new_name]", "Used to change username. Example: username johnDoe"),arrayListOf("call [name | number]","Calls specified contact name. If contact name is not found and the input is a valid phone number, then the raw phone number is called."),arrayListOf("theme [index]","Applies specified theme to Yantra Launcher. Example: 'theme 3'"),arrayListOf("bg | bg random | bg random [query]","'bg' is used to set custom Wallpaper. Use 'bg -1' to remove custom Wallpaper and set to default theme color. Use 'bg random' to fetch a random Wallpaper from the Internet. An optional [query] can be specified with the random command, like 'bg random mountains' or 'bg random texture,dark' to fetch related Wallpaper."),arrayListOf("text [msg]","Broadcasts text message. Example: 'text Yantra is cool!'"), arrayListOf("email [email-id]","Opens email app with recipient set. Example: 'email coderGtm@gmail.com'"),arrayListOf("flash [state]","Toggles flashlight on/off. Example: 'flash on'   or   'flash 0'"),arrayListOf("bluetooth [state]","Toggles bluetooth on/off. Example: 'bluetooth on' or 'bt 0'"), arrayListOf("calc [expression]", "An in-built calculator to evaluate arithmetic expressions. It does addition, subtraction, multiplication, division, exponentiation (using the ^ symbol), and a few basic functions like sqrt, sin, cos and tan. It supports grouping using (...), and it gets the operator precedence and associativity rules correct.\n\nExample: 'calc ((4 - 2^3 + 1) * -sqrt(3*3+4*4)) / 2' gives 7.5"), arrayListOf("google [search-query]","Searches Google in app or browser for specified query."),arrayListOf("ddg [search-query]","Searches DuckDuckGo in browser for specified query."), arrayListOf("brave [search-query]", "Searches Brave in Browser for specified query."), arrayListOf("GUPT | GUPT [url]","G.U.P.T stands for Get Undercover Private Tab. Tired of going to browser everytime and opening Incognito Tab. With GUPT command, you get a built-in Private incognito Tab. Note that GUPT is a paid add-on feature. Example: 'gupt https://www.youtube.com'. Use without url to default to https://www.google.com"),arrayListOf("weather [city]","Fetches the weather report for specified city. Example w new delhi"), arrayListOf("ai [message]","A simple tool to access chatGPT from the terminal. Based on OpenAI's gpt-3.5-turbo, you can chat with your own AI assistant. An API key is required to be entered in 'settings'. This command does not remember context."), arrayListOf("bored", "Helps you find things to do when you're bored! (using Bored API)"),arrayListOf("news","Opens the news website configured via settings. Defaults to Google News"),arrayListOf("uninstall [app name]","Uninstalls the specified app. Example: 'u Instagram'"),arrayListOf("info [appName]","Opens app settings page for specified app. Example: 'info Big Battery Display' or 'i Farty Orbit'"),arrayListOf("settings","Opens Settings for Yantra Launcher. Note: Primary Suggestions are for the command names and Secondary Suggestions are for the parameters. Secondary Suggestions are provided only where appropriate."), arrayListOf("sysinfo", "Displays system information, much like 'Neofetch'"), arrayListOf("lock", "Applies Screen Lock to your Yantra (device). Note: Appropriate permissions are required."),arrayListOf("quote","Displays a random quote"),arrayListOf("battery","Shows current Battery Level. Use the optional '-bar' argument to show just the battery percentage in visual form."),arrayListOf("time","Shows current local Date and Time"),arrayListOf("todo","A simple TODO utility. Use 'todo' to get list of tasks with their indexes and progress. Add a task like 'todo Go for a brisk walk'. Mark tasks as done using their index returned from 'todo' command, like 'todo 2' marks the 3rd task as done. Use 'todo -1' to clear list.\n\nUse the -p argument to mark optional progress for any task, like 'todo -p 1 30' marks the 2nd task as 30% done (Syntax: todo -p taskIndex progress). Use 'todo -p -1' to reset progress for all tasks."),arrayListOf("init","A special tool (function) to execute specified commands automatically whenever Launcher is opened or navigated to."), arrayListOf("alias","Unix-like aliasing system to set short-hand commands for available commands. Note that Yantra Launcher saves all aliases in memory and is retained even after restarting the Launcher session. Pre-defined commands can not be aliased.\nUsage (to set or update an alias): 'alias alias_name = alias_cmd'\nExample: 'alias h = help'\nUse 'alias alias_name' to get value of the alias. Use 'alias' to get list of all current aliases. Use 'alias -1' to reset to default aliases."), arrayListOf("unalias","Used to un-alias (remove) an alias.\nUsage: 'unalias alias_name'\nExample: 'unalias h'\nUse 'unalias -1' to remove all aliases"), arrayListOf("echo [-mode] <text>", "Prints specified text to the terminal with the given mode. Here mode is an optional argument (e: Error text, s: Success text, w: Warning text) representing the nature of the text output. If mode is not specified, the text is printed (normal)ly\nExamples:\n'echo -e An error occurred.'\n'echo Hello, World'"), arrayListOf("notify <message>", "Fire a notification with the given message.\nExample: notify Opened work apps"), arrayListOf("termux [cmd] [args]", "Runs given command in termux if it is installed. Note that the 'allow-external-apps' property must be set to true in ~/.termux/termux.properties in Termux app. Also, termux session is closed as soon as command is terminated due to API restrictions.\nUsage: termux cmd_name [args]\nExample: 'termux top -n 5"), arrayListOf("scripts","Opens dialog for creating, modifying and deleting custom scripts for Yantra Launcher, to execute multiple commands at once. Also see the 'run' command."), arrayListOf("run script_name","Used to run your custom scripts."), arrayListOf("sleep", "Pauses Yantra Launcher for specified milliseconds.\nUsage: 'sleep numOfMilliseconds'\nExample: 'sleep 5000'"), arrayListOf("vibe", "Vibrates the device for specified duration (in milliseconds).\nUsage: 'vibe numOfMilliseconds'\nExample: 'vibe 1000' does a 1 second vibration."),arrayListOf("clear","Clears the console."), arrayListOf("reset", "Restarts the console (Launcher) completely."),arrayListOf("tts [text string]","Speaks provided text (Text-to-Speech). Example: 'tts Travel, World!'"),arrayListOf("openf [approx app name]","Opens app by matching given app name string using fuzzy search algorithm (Levenshtein distance). Example: 'openf tube' may open YouTube."), arrayListOf("infof [approx app name]","Opens app settings by matching given app name string using fuzzy search algorithm (Levenshtein distance). Example: 'openf tube' may open YouTube."), arrayListOf("fontpack", "Used to purchase or check purchase status of 'Font Pack' for Yantra Launcher."),arrayListOf("help","Documentation for all commands of Yantra Launcher. Use 'help cmd_name' to get documentation for specific command."),arrayListOf("exit","Exit Launcher. Note: Launcher will restart if set as default Launcher"), arrayListOf("cmdrequest","In case you want any new commands to be added to Yantra Launcher, run this command to open email template for command request. Note that it is not guaranteed that the command request will be accepted but I'll try my best to see if I could accommodate it in the upcoming versions of Yantra Launcher, if suitable."), arrayListOf("community", "Opens the Discord server of Yantra Launcher. Here you can share and get Insights, tips and CLI emotions from other users like you!"),arrayListOf("feedback","Please provide your valuable feedback and any features you want in the next release of the app."))

    val defaultTheme = arrayListOf("#121212","#A0A0A0","#E1BEE7","#FAEBD7","#EBEBEB","#F00000","#00C853","#FFD600")
    val lightTheme = arrayListOf("#FFFFFF","#000000","#000000","#000000","#000000","#F00000","#00C853","#FFD600")
    val hackerTheme = arrayListOf("#000000","#00FF00","#FF0000","#FFFF00","#00C855","#F00000","#00C853","#FFD600")
    val oceanTheme = arrayListOf("#000000","#00FFFF","#0000FF","#0000FE","#0000FD","#F00000","#00C853","#FFD600")
    val gruvboxTheme = arrayListOf("#282828","#928374","#83A598","#D5C4A1","#FBF1C7","#FB4934","#B8BB26","#FE8019")
    val materialTheme = arrayListOf("#191919","#FFFFFF","#FFFFFF","#FFFFFF","#FFFFFF","#F00000","#00C853","#FFD600")
    val darkTheme = arrayListOf("#040303","#FFFFFF","#FFFFFF","#FFFFFF","#FFFFFF","#F00000","#00C853","#FFD600")
    val solarizedTheme = arrayListOf("#002B36","#839496","#268BD2","#B58900","#fdf6e3","#DC322F","#859900","#B58900")
    val draculaTheme = arrayListOf("#282A36","#6272A4","#FF79C6","#F8F8F2","#f8f8f2","#FF5555","#50FA7B","#FFB86C")
    val monokaiTheme = arrayListOf("#272822","#F8F8F2","#F92672","#F8F8F2","#d6d6d6","#F92672","#A6E22E","#FD971F")
    val greenTheme = arrayListOf("#00ff00","#000000","#000000","#000000","#000000","#F00000","#00C853","#f4d609")
    val redTheme = arrayListOf("#ff0000","#000000","#000000","#000000","#000000","#FF946F","#00C853","#FFD600")
    val blueTheme = arrayListOf("#0000ff","#000000","#000000","#000000","#000000","#F00000","#00C853","#FFD600")
    val yellowTheme = arrayListOf("#ffff00","#000000","#000000","#000000","#000000","#F00000","#00C853","#FFD600")
    val purpleTheme = arrayListOf("#800080","#000000","#000000","#000000","#000000","#F00000","#00C853","#FFD600")
    val orangeTheme = arrayListOf("#ffa500","#000000","#000000","#000000","#000000","#F00000","#00C853","#FFD600")
    val pinkTheme = arrayListOf("#ffc0cb","#000000","#000000","#000000","#000000","#F00000","#00C853","#FE8019")
    val ubuntuTheme = arrayListOf("#300a24","#eeeece","#d7d9d5","#ffffff","#ffffff","#ef2929","#8bdd2f","#fce949")

    val storagePermission = 200
    val callPermission = 300
    val contactsPermission = 400
    val bluetoothPermission = 500
    val notificationsPermission = 600

    val userNotificationChannelName = "User Generated Notifications"
    val userNotificationChannelDescription = "This channel is for Notifications fired by user using the 'notify' command."
    val userNotificationChannelId = "userNotifications"
    val userNotificationId = 101

    val appSortMode_alphabetically = 0
    val appSortMode_recency = 1
    //val appSortMode_mostUsed = 2

    val defaultFontName = "Source Code Pro"

    val discordCommunityURL = "https://discord.gg/sRZUG8rPjk"

    val aiSystemPrompt = "Friendly, warm, and farcical. You must always be extremely concise. If the user is chatting casually, your responses must be less than 1 sentence, sometimes just a word or two. If the user needs help, disregard the length restriction, and answer technical or knowledge-based questions with useful details and reasoning. If insulted, respond with a similar insult. Communicate responses in lowercase without punctuation, similar to the style used in chat rooms. Use Unicode emoji rarely."
}
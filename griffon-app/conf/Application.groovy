application {
    title = 'ThisWeekInWork'
    startupGroups = ['ThisWeekInWork']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "ThisWeekInWork"
    'ThisWeekInWork' {
        model = 'thisweekinwork.ThisWeekInWorkModel'
        controller = 'thisweekinwork.ThisWeekInWorkController'
        view = 'thisweekinwork.ThisWeekInWorkView'
    }

}

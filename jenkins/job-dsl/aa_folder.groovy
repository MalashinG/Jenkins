def folders = [
    [
        name: 'test',
        displayName: 'Test Folder',
        description: 'This is a test folder'
    ]
]


folders.each { item ->
    folder(item.name) {
        displayName(item.displayName)
        description(item.description)
    }
}
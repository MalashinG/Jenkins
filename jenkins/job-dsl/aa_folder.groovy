def folder = [
    [
        name: 'test',
        displayName: 'Test Folder',
        description: 'This is a test folder'
    ]
]


folder.each { item ->
    folder(item.name) {
        displayName(item.displayName)
        description(item.description)
    }
}
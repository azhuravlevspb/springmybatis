var booksProxy = new Ext.data.HttpProxy({
    url: '../data/books',
    headers: {'Accept': 'application/json, text/plain'},
});
//booksProxy.setUrl('../data/books', true);


var bookReader = new Ext.data.JsonReader({
    totalProperty: 'total',
    successProperty: 'success',
    idProperty: 'id',
    fields: [
        {name: 'id'},
        {name: 'name', allowBlank: true},
        {name: 'author_id', allowBlank: true},
        {name: 'price', allowBlank: true}

    ]
});
var bookWriter = new Ext.data.JsonWriter({
    encode: true,
    writeAllFields: true,
    returnJson: true,
    render: function(params, baseParams, data) {
        params.jsonData = data;
    }

});

var bookStore = new Ext.data.Store({
    restful: true,
    proxy: booksProxy,
    reader: bookReader,
    writer: bookWriter,
    listeners: {
        save: function(store){
            store.load();
        }
    }
});


bookStore.load();

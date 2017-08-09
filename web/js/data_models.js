var Author = Ext.data.Record.create([
    {
        name: 'id'
    },
    {
        name: 'name',
        type: 'string'
    }, {
        name: 'surname',
        type: 'string'
    }]);


var Book = Ext.data.Record.create([
    {
        name: 'id',
    },
    {
        name: 'name',
        type: 'string'
    }, {
        name: 'phone',
        type: 'string'
    },
    {
        name: 'author_id',
        type: 'int',
        //mapping: 'author.id'
    }, {
        name: 'price',
        type: 'int'
    }
    ]);
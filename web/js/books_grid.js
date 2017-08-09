var userColumns = [
    {
        header: "Name",
        width: 100,
        sortable: true,
        dataIndex: 'name',
        editor: new Ext.form.TextField({})
    },
    {
        header: "Author",
        width: 100,
        sortable: true,
        dataIndex: 'author_id',
        editor: new Ext.form.ComboBox({
            typeAhead: true,
            triggerAction: 'all',
            lazyRender: true,
            listClass: 'x-combo-list-small',
            mode: 'local',
            store: authorStore,
            displayField: 'surname',
            valueField: 'id'
        }),
        renderer: function (value, metaData, record, rowIndex, colIndex, store) {
            if (value === null) return '';
            if (value % 1 === 0) {
                var obj = (authorStore.getAt(authorStore.find('id', value)));
                if (typeof obj !== 'undefined')
                    return obj.data.name + ' ' + obj.data.surname;
            }
            return '';
        }
    },
    {
        header: "Price",
        width: 100,
        sortable: true,
        dataIndex: 'price',
        xtype: 'numbercolumn',
        editor: new Ext.form.NumberField({})
    }

];
Ext.onReady(function () {

        var editor = new Ext.ux.grid.RowEditor({
            saveText: 'Save'
        });


        var userGrid = new Ext.grid.GridPanel({
            renderTo: 'books-grid',
            iconCls: 'icon-grid',
            frame: true,
            title: 'Books',
            height: 300,
            store: bookStore,
            plugins: [editor],
            columns: userColumns,
            enableColumnHide: false,
            tbar: [{
                text: 'Add',
                handler: function () {
                    var e = new Book({
                        name: 'New book',
                        author_id: null,
                        price: 0
                    });
                    editor.stopEditing();
                    userGrid.getStore().insert(0, e);

                }
            }, {
                text: 'Delete',
                handler: function () {
                    editor.stopEditing();
                    var s = userGrid.getSelectionModel().getSelections();
                    for (var i = 0, r; r = s[i]; i++) {
                        editor.stopEditing();
                        userGrid.getStore().remove(r);
                    }
                }
            }],
            viewConfig: {
                forceFit: true
            }
        });
    }
);
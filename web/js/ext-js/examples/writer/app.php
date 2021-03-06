<?php
    require('remote/init.php');

    // Get Request
    $request = new Request(array('restful' => false));

    //echo "<P>request: " . $request->to_string();

    // Get Controller
    require('remote/app/controllers/' . $request->com.springmybatis.controller . '.php');
    $controller_name = ucfirst($request->com.springmybatis.controller);
    $com.springmybatis.controller = new $controller_name;


    // Dispatch request
    echo $com.springmybatis.controller->dispatch($request);


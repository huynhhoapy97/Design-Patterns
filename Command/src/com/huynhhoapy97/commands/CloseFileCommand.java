package com.huynhhoapy97.commands;

import com.huynhhoapy97.receivers.System;

public class CloseFileCommand implements Command {
    private System system;

    public CloseFileCommand(System system){
        this.system = system;
    }

    @Override
    public void execute() {
        this.system.close();
    }
}

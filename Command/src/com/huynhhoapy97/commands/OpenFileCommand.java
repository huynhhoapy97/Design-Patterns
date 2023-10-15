package com.huynhhoapy97.commands;

import com.huynhhoapy97.receivers.System;

public class OpenFileCommand implements Command {
    private System system;

    public OpenFileCommand(System system) {
        this.system = system;
    }

    @Override
    public void execute() {
        this.system.open();
    }
}

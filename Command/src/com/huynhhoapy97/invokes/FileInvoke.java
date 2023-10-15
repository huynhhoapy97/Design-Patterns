package com.huynhhoapy97.invokes;

import com.huynhhoapy97.commands.Command;

public class FileInvoke {
    private Command command;

    public FileInvoke(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}

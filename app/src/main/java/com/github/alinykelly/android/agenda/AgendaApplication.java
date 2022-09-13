package com.github.alinykelly.android.agenda;

import android.app.Application;

import com.github.alinykelly.android.agenda.dao.AlunoDAO;
import com.github.alinykelly.android.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Aliny", "85991234567", "aliny@email.com"));
        dao.salva(new Aluno("Rafa", "85997654321", "rafa@email.com"));
    }
}

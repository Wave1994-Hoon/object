package v3;

import v3.Paper.Client;
import v3.Paper.Paper;
import v3.Paper.ServerClient;
import v3.programmer.BackEnd;
import v3.programmer.FrontEnd;
import v3.programmer.Programmer;

import java.util.HashMap;
import java.util.Map;

public class Director {
    private Map<String, Paper> projects = new HashMap<>();

    public void addProject(String name, Paper paper) {
        projects.put(name, paper);
    }

    private void runProject(String name) {
        if (!projects.containsKey(name)) {
            throw new RuntimeException("no proeject");
        }

        Paper paper = projects.get(name);

        /*
         * 무한히 버그를 생성하는 컨텍스트 에러 (특정 상황에서) 를 발생시킨다.
         * 사람이 판별할 수 밖에 없더.
         */
        if (paper instanceof ServerClient) {

            ServerClient project = (ServerClient) paper;
            Programmer frontend = new FrontEnd<ServerClient>() {
                @Override
                protected void setData(ServerClient paper) {

                }
            };

            Programmer backend = new BackEnd<ServerClient>() {
                @Override
                protected void setData(ServerClient paper) {

                }
            };

        } else if (paper instanceof Client) {
            // TODO deploy
        }
    }

    private void deploy(String projectName, Program...programs) {

    }

}

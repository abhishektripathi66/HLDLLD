package LowLevelDesign.DesignPatterns.creationalDesignPatterns.ObjectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolManager {

    List<Connection> freeConnectionsPool = new ArrayList<>();
    List<Connection> connectionInUse = new ArrayList<>();

    int INITIAL_POOL_SIZE = 3;
    int MAX_POOL_SIZE = 6;

    public ConnectionPoolManager(){
        for(int i=0;i<INITIAL_POOL_SIZE;i++){
            freeConnectionsPool.add(new Connection());
        }
    }

    public Connection getConnection(){
        if(freeConnectionsPool.isEmpty() && connectionInUse.size()<MAX_POOL_SIZE){
            freeConnectionsPool.add(new Connection());
            System.out.println("creating new connection and putting into the pool, free pool size: "+ freeConnectionsPool.size());
        }
        else if(freeConnectionsPool.isEmpty() && connectionInUse.size()>=MAX_POOL_SIZE){
            System.out.println("cannot create new connection, as max limit reached");
            return null;
        }
        Connection connection = freeConnectionsPool.remove(freeConnectionsPool.size()-1);
        connectionInUse.add(connection);
        System.out.println("Adding conection into use pool, size: "+connectionInUse.size());
        return connection;
    }

    public void releaseConnection(Connection connection){
        
    }
    
}

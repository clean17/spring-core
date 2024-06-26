package hello.core.scope;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogService {

    private final ObjectProvider<MyLogger> myLoggersProvider;

    public void logic(String id) {
        MyLogger myLogger = myLoggersProvider.getObject();
        myLogger.log("service id = "+ id);
    }

}

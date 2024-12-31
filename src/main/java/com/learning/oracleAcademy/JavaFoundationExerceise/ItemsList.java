package main.java.com.learning.oracleAcademy.JavaFoundationExerceise;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class ItemsList implements Handler {
    private Clothing[] items;

    public ItemsList(Clothing[] itemsList) {
        items = itemsList;
    }

    @Override
    public void accept(ServerRequest serverRequest, ServerResponse serverResponse) {
        serverResponse.status(Http.Status.OK_200);
        serverResponse.headers().put("Content-Type", "text/plain; charset=UTF-8");

        StringBuilder builder = new StringBuilder();
        for (Clothing itemValues : items) {
            builder.append(itemValues + "\t");
        }
        serverResponse.send(builder);

    }
}

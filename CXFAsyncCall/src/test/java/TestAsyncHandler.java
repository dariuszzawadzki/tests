import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import pl.orange.gpon.GetInventoryDataResponse;

public class TestAsyncHandler implements AsyncHandler<GetInventoryDataResponse> {

	public void handleResponse(Response<GetInventoryDataResponse> response) {
		System.out.println(Thread.currentThread().getName()+ " response=" + response);
		try {

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
//
//
//  Networking-Swagger Code Generate Creater 1.1
//  WorkplaceServiceManager.java
//  Copyright © 2019 OneFrame Mobile - Koçsistem All rights reserved.
//

package com.kocsistem.oneframe.networking;;

import com.oneframe.android.networking.NetworkConfig;
import com.oneframe.android.networking.NetworkManager;
import com.oneframe.android.networking.NetworkingFactory;
import com.oneframe.android.networking.listener.NetworkResponseListener;
import com.oneframe.android.networking.volleywrapper.GenericObjectRequest;
import com.oneframe.android.networking.model.ErrorModel;
import java.util.List;


//{{model_package}}
import com.kocsistem.oneframe.networking.models.User;
import com.kocsistem.oneframe.networking.models.Category;
import com.kocsistem.oneframe.networking.models.Pet;
import com.kocsistem.oneframe.networking.models.Tag;
import com.kocsistem.oneframe.networking.models.ModelApiResponse;
import com.kocsistem.oneframe.networking.models.Order;

public class WorkplaceServiceManager {

    private static final String RESULT_TAG = "[JSON_KEY]";

    private NetworkManager manager;

    public WorkplaceServiceManager() {
        manager = NetworkingFactory
                .create()
                .setJsonKey(RESULT_TAG);
                //.setNetworkLearning(new AdvancedNetworkLearning());

        NetworkConfig.getInstance().deleteAllHeaders();
        NetworkConfig.getInstance().setURL("https://petstore.swagger.io/v2/swagger.json/");
        //NetworkConfig.getInstance().setBodyContentType("application/json; charset=utf-8");

        /*
        NetworkConfig
                .getInstance()
                .addHeader("Cache-Control", "no-cache")
                .addHeader("LanguageCode", "en")
                .addErrorCodes(500);
        */
    }

    //{{request_func}}

public GenericObjectRequest findPetsByTags(final NetworkResponseListener<String, ErrorModel<String>> listener , List<String> tags) {
         return manager.get("/pet/findByTags?tags=\(tags)", listener);
     }

public GenericObjectRequest uploadFile([REQUEST_MODEL_NAME] model, final NetworkResponseListener<ApiResponse, ErrorModel<String>> listener , String file) {
         return manager.post("""""", model, listener);
     }

public GenericObjectRequest createUser([REQUEST_MODEL_NAME] model, final NetworkResponseListener<String, ErrorModel<String>> listener , User body) {
         return manager.post("", model, listener);
     }

public GenericObjectRequest createUsersWithListInput([REQUEST_MODEL_NAME] model, final NetworkResponseListener<String, ErrorModel<String>> listener , List<User> body) {
         return manager.post("", model, listener);
     }

public GenericObjectRequest logoutUser(final NetworkResponseListener<String, ErrorModel<String>> listener) {
         return manager.get("/user/logout", listener);
     }

public GenericObjectRequest findPetsByStatus(final NetworkResponseListener<String, ErrorModel<String>> listener , List<String> status) {
         return manager.get("/pet/findByStatus?status=\(status)", listener);
     }

public GenericObjectRequest getUserByName(final NetworkResponseListener<User, ErrorModel<String>> listener , String username) {
         return manager.get("", listener);
     }

public GenericObjectRequest getOrderById(final NetworkResponseListener<Order, ErrorModel<String>> listener , Int orderId) {
         return manager.get("", listener);
     }

public GenericObjectRequest loginUser(final NetworkResponseListener<String, ErrorModel<String>> listener , String password) {
         return manager.get(""/user/login?username=\(username)"&password=\(password)", listener);
     }

public GenericObjectRequest getInventory(final NetworkResponseListener<String, ErrorModel<String>> listener) {
         return manager.get("/store/inventory", listener);
     }

public GenericObjectRequest addPet([REQUEST_MODEL_NAME] model, final NetworkResponseListener<String, ErrorModel<String>> listener , Pet body) {
         return manager.post("", model, listener);
     }

public GenericObjectRequest getPetById(final NetworkResponseListener<Pet, ErrorModel<String>> listener , Int petId) {
         return manager.get("", listener);
     }

public GenericObjectRequest updatePetWithForm([REQUEST_MODEL_NAME] model, final NetworkResponseListener<String, ErrorModel<String>> listener , String status) {
         return manager.post("""""", model, listener);
     }

public GenericObjectRequest placeOrder([REQUEST_MODEL_NAME] model, final NetworkResponseListener<Order, ErrorModel<String>> listener , Order body) {
         return manager.post("", model, listener);
     }

public GenericObjectRequest createUsersWithArrayInput([REQUEST_MODEL_NAME] model, final NetworkResponseListener<String, ErrorModel<String>> listener , List<User> body) {
         return manager.post("", model, listener);
     }
}
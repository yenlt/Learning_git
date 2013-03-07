package com.esoftsystems.f2.uitest.core;

import org.openqa.selenium.By;

public enum elements {
    
    SELECT_PRODUCT("//div/fieldset/div/div/div/div/div[2]/div/div/div/div/div[2]/div/select"),  
    PRODUCT_FILM_A("//div/fieldset/div/div/div/div/div[2]/div/div/div/div/div[2]/div/select/option[2]"),         
    PRODUCT_FILM_C("//div/fieldset/div/div/div/div/div[2]/div/div/div/div/div[2]/div/select/option[3]"),
    PRODUCT_SPEAK_DANSK("//div/fieldset/div/div/div/div/div[2]/div/div/div/div/div[2]/div/select/option[4]"),
    PRODUCT_SPEAK_ENGLISH("//div/fieldset/div/div/div/div/div[2]/div/div/div/div/div[2]/div/select/option[5]"),
    PRODUCT_SPEAK_GERMAN("//div/fieldset/div/div/div/div/div[2]/div/div/div/div/div[2]/div/select/option[6]"),
    PRODUCT_SPEAK_RE_EDITING("//div/fieldset/div/div/div/div/div[2]/div/div/div/div/div[2]/div/select/option[7]"),
    PRODUCT_SPEAK_RE_FILMING("//div/fieldset/div/div/div/div/div[2]/div/div/div/div/div[2]/div/select/option[8]"), 
    PRODUCT_FILM_A_ADD_ON1("//div/table/tbody/tr/td/div/span/input"), 
    PRODUCT_FILM_A_ADD_ON2("//div/table/tbody/tr[2]/td/div/span/input"),
    PRODUCT_FILM_A_ADD_ON3("//div/table/tbody/tr[3]/td/div/span/input"),
    PRODUCT_FILM_C_ADD_ON1("//div/table/tbody/tr/td/div/span/input"),
    PRODUCT_FILM_C_ADD_ON2("//div/table/tbody/tr[2]/td/div/span/input"),
    PRODUCT_FILM_C_ADD_ON3("//div/table/tbody/tr[3]/td/div/span/input"),
    PRODUCT_FILM_C_ADD_ON4("//div/table/tbody/tr[4]/td/div/span/input"),
    PRODUCT_FILM_C_ADD_ON5("//div/table/tbody/tr[5]/td/div/span/input"),
    PRODUCT_FILM_C_ADD_ON6("//div/table/tbody/tr[6]/td/div/span/input"),
    SELECT_AMOUNT_FIELD("order.form.selectedNumber20012"),   
      
    FIRST_BOOK_BUTTON("//div/table/tbody/tr/td[8]/div/div/div/div[2]/div/button"),
    FIRST_PARK_BUTTON("//div/table/tbody/tr/td[8]/div/div/div/div[3]/div/button"),   
    UNBOOKED_BOOK_BUTTON("id.button.book.a16fe710-8f9b-448f-bca2-4b7deb9d925a"),
    DATA_CARD_BUTTON_AT_UNBOOKED_ORDER_PAGE("id.button.show_datacard.a16fe710-8f9b-448f-bca2-4b7deb9d925a"),
    DATA_CARD_BUTTON_AT_BOOKED_ORDER_PAGE("id.button.show_datacard.0b4aaba8-8f66-430b-b1ff-2923f4840988"),
    DATA_CARD_BUTTON_AT_ORDER_FOR_EDITOR_PAGE("id.button.show_datacard.d5750f46-ae77-474f-b29f-1c9c69cbf8e8"),
    DATA_CARD_BUTTON_AT_DONE_ORDERS_PAGE("id.button.show_datacard.215b6f1e-a343-46b4-ace4-99e419cbf8db"),    
    BOOKER_PREVIEW_BUTTON("//div/table/tbody/tr/td[7]/div/div/div/div/div/div/span/span"),  
    PHOTOGRAPHER_PREVIEW_BUTTON("//div/table/tbody/tr/td[7]/div/div/div/div/div/div/span/span"),
    EDITOR_PREVIEW_BUTTON("//div/table/tbody/tr/td[7]/div/div/div/div[2]/div/div/span/span"),
    QA_PREVIEW_BUTTON("//div/table/tbody/tr[2]/td[7]/div/div/div/div[2]/div/div/span/span"),        
    PHOTOGRAPHED_BUTTON("//div/table/tbody/tr/td[8]/div/div/div/div/div/div/span/span"),    
   // PARKED_BOOK_BUTTON("//div[@class= 'v-table-body-noselection']/table/tbody/tr/td[7]/div/div/div/div[1]/div/div/span/span"),
   // EDIT_PARKING_BUTTON("//div[@class= 'v-table-body-noselection']/table/tbody/tr/td[7]/div/div/div/div[2]/div/div/span/span"),  
    PARKED_BOOK_BUTTON("id.button.book.35965c6d-9f25-4bcd-9e68-36715d6c35cb"),  
    EDIT_PARKING_BUTTON("id.button.edit_parking.35965c6d-9f25-4bcd-9e68-36715d6c35cb"),   
    PHOTOGRAPHER_OfP_COMMENT_BUTTON("id.button.add_comment.a16fe710-8f9b-448f-bca2-4b7deb9d925a"),    
    //PARK_BUTTON("//div[@class= 'v-table-body-noselection']/table/tbody/tr/td[8]/div/div/div/div[3]/div/div/span/span"),
    PARK_BUTTON("id.button.park.a16fe710-8f9b-448f-bca2-4b7deb9d925a"),
    
    //CANCEL_BUTTON("//div[@class= 'v-table-body-noselection']/table/tbody/tr/td[8]/div/div/div/div[4]/div/div/span/span"),
    CANCEL_BUTTON("id.button.cancel.a16fe710-8f9b-448f-bca2-4b7deb9d925a"),
    
    FIRST_UPLOAD_FILE_BUTTON("//div[4]/div/div/div/div/div/form/div/input[@type='file']"),
    REPLACE_FIRST_UPLOAD_FILE_BUTTON("//div[4]/div/div/div/div[2]/div/form/div/div/span/span"),    
    SECOND_UPLOAD_FILE_BUTTON("//div[6]/div/div/div/div/div/form/div/input[@type='file']"),    
    REPLACE_SECOND_UPLOAD_FILE_BUTTON("//div[6]/div/div/div/div[2]/div/form/div/div/span/span"),
    THIRD_UPLOAD_FILE_BUTTON("//div[8]/div/div/div/div/div/form/div/input[@type='file']"),
    REPLACE_THIRD_UPLOAD_FILE_BUTTON("//div[8]/div/div/div/div[2]/div/form/div/div/span/span"),
    POPUP_HEADER("/html/body/div[4]/div/div/div/div[2]/div"),     
    BOOKER_UPDATE_BUTTON("id.button.update.a16fe710-8f9b-448f-bca2-4b7deb9d925a"),
    
    CUSTOMER_UPDATE_BUTTON("id.button.update.35965c6d-9f25-4bcd-9e68-36715d6c35cb"),
    PREVIEW_BUTTON("id.button.preview.85f97f10-b690-4189-a511-15291fc52505"),   
    
    BOOK_BUTTON("id.button.book.35965c6d-9f25-4bcd-9e68-36715d6c35cb"),
    BOOKER_BOOKED_ORDERS_COMMENT_BUTTON("id.button.add_comment.0b4aaba8-8f66-430b-b1ff-2923f4840988"),
    DONE_ORDERS_COMMENT_BUTTON("id.button.add_comment.85f97f10-b690-4189-a511-15291fc52505"),
    EDITOR_OfE_COMMENT_BUTTON("id.button.add_comment.b865688f-7fcb-4ba9-879e-7f717a09f4a8"),
    SHOW_COMMENTS_BUTTON("id.button.show_comments.a16fe710-8f9b-448f-bca2-4b7deb9d925a"),    
    BOOKER_UNBOOKED_ORDERS_COMMENT_BUTTON("id.button.add_comment.a16fe710-8f9b-448f-bca2-4b7deb9d925a"),        
    LABEL("//div[@class = 'v-label v-label-user-info user-info v-label-undef-w']");
    
    private final String value;

    private elements(String value) {
        this.value = value;
    }

    /**
     * Get name of the Owner from a specific value.
     * @param value
     *          the input value
  * @return 
     * @return
     *          enumeration name of F2Element
     */
    public static elements fromValue(String value) {
      elements defaultEvent = PRODUCT_FILM_A;

        if (value != null) {
            for (elements owner : values()) {
                if (owner.value.equals(value)) {
                    return owner;
                }
            }
        }

        return defaultEvent;
    }

    /**
     * Convert to value.
     * @return
     *          the value of F2Element
     */
    public String toValue() {
        return value;
    }
 }


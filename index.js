   $(document).ready(function(){
          $('#floatingInput').focus();
    });
      $(document).ready(function() {
    $('#SingIn').click(function() {
      var username = $('#floatingInput').val();
      var password = $('#floatingPassword').val();

      // AJAX request
      $.ajax({
        url: 'loginInfo/getCredential',
        method: 'POST',
        contentType: 'application/json',
        data: JSON.stringify({ username: username, password: password }),
        success: function(response) {
        console.log(response);
          if(response == 'Login success'){
                //alert(response);
                //toastr.success("Login success");
                window.location.replace("form.html");
          }else{
           //toastr.error(response);
           alert(response);
           $('#floatingInput').val("");
           $('#floatingPassword').val("");
            $('#floatingInput').focus();
          }
        },
        error: function(xhr, status, error) {
          // Handle errors
          console.error(xhr.responseText);
        }
      });
    });
  });

//getDetails
$(document).ready(function() {
    $('#getDetailsBtn').click(function() {
        // Get the value of the certificate number input field
        var certificateNo = $('#certificateNoInput').val();
        console.log("certificateNo: " + certificateNo);

        // AJAX request
        $.ajax({
            url: 'factoryInfo/getDetails?certificate_no=' + certificateNo,
            method: 'GET',
            success: function(response) {
                // Set response data to textboxes
                $('#id').val(response.id);
                $('#factory_name').val(response.factory_name);
                $('#factory_address').val(response.factory_addr);
                $('#distinctive_no').val(response.machine_name);
                $('#capacity').val(response.capacity);
                $('#sno').val(response.sl_no);
                $('#make').val(response.make);
                $('#heightLift').val(response.lift_height);
                $('#crane').val(response.crane_no);
                $('#idNo').val(response.id_no);
                $('#machine_date').val(response.lift_machine_date);
                $('#machine_loc').val(response.lift_machine_loc);
                $('#issued_cert').val(response.certificate_issue);
                $('#date_cert_carried').val(response.certificate_carried);
                $('#date_heat_cert_carried').val(response.heat_lift_carried_certificate);
                $('#remedy_defects').val(response.defects_remedy);
                $('#swl').val(response.swl);
                $('#device_condition').val(response.device_condition);
                $('#visual_ins').val(response.visual_inspection);
                $('#remarks').val(response.remarks);
                $('#testedOn').val(response.tested_on);
                // Set other textboxes similarly with respective response properties

                // Assuming response is a JSON object, you can access its properties and use them to set textbox values
            },
            error: function(xhr, status, error) {
                // Handle errors
                console.error(xhr.responseText);
            }
        });
    });
});


//save

$(document).ready(function() {
    $('#save').click(function() {
        // Create a new FormData object
        var formData = new FormData();

        // Append form data to the FormData object
        formData.append('factory_name', $('#factory_name').val());
        formData.append('factory_addr', $('#factory_address').val());
        formData.append('machine_name', $('#distinctive_no').val());
        formData.append('capacity', $('#capacity').val());
        formData.append('sl_no', $('#sno').val());
        formData.append('make', $('#make').val());
        formData.append('lift_height', $('#heightLift').val());
        formData.append('crane_no', $('#crane').val());
        formData.append('id_no', $('#idNo').val());
        formData.append('lift_machine_date', $('#machine_date').val());
        formData.append('lift_machine_loc', $('#machine_loc').val());
        formData.append('certificate_issue', $('#issued_cert').val());
        formData.append('certificate_carried', $('#date_cert_carried').val());
        formData.append('heat_lift_carried_certificate', $('#date_heat_cert_carried').val());
        formData.append('defects_remedy', $('#remedy_defects').val());
        formData.append('swl', $('#swl').val());
        formData.append('device_condition', $('#device_condition').val());
        formData.append('visual_inspection', $('#visual_ins').val());
        formData.append('remarks', $('#remarks').val());
        formData.append('tested_on', $('#testedOn').val());
        formData.append('certificate_no', $('#certificateNumber').text());
        // Add other form fields as needed

        // AJAX request
        $.ajax({
            url: 'factoryInfo/saveFactory',
            method: 'POST',
            data: formData, // Set the data to the FormData object
            processData: false, // Prevent jQuery from automatically processing the data
            contentType: false, // Prevent jQuery from automatically setting the content type
            success: function(response) {
                console.log(response);
                // Handle success response
            },
            error: function(xhr, status, error) {
                // Handle errors
                console.error(xhr.responseText);
            }
        });
    });
});

//update
$(document).ready(function() {
    $('#update').click(function() {
        // Create a new FormData object
        var formData = new FormData();

        // Append form data to the FormData object
        formData.append('id', $('#id').val()); // Assuming you have an input field with id="id" for the record ID
        formData.append('factory_name', $('#factory_name').val());
        formData.append('factory_addr', $('#factory_address').val());
        formData.append('machine_name', $('#distinctive_no').val());
        formData.append('capacity', $('#capacity').val());
        formData.append('sl_no', $('#sno').val());
        formData.append('make', $('#make').val());
        formData.append('lift_height', $('#heightLift').val());
        formData.append('crane_no', $('#crane').val());
        formData.append('id_no', $('#idNo').val());
        formData.append('lift_machine_date', $('#machine_date').val());
        formData.append('lift_machine_loc', $('#machine_loc').val());
        formData.append('certificate_issue', $('#issued_cert').val());
        formData.append('certificate_carried', $('#date_cert_carried').val());
        formData.append('heat_lift_carried_certificate', $('#date_heat_cert_carried').val());
        formData.append('defects_remedy', $('#remedy_defects').val());
        formData.append('swl', $('#swl').val());
        formData.append('device_condition', $('#device_condition').val());
        formData.append('visual_inspection', $('#visual_ins').val());
        formData.append('remarks', $('#remarks').val());
        formData.append('tested_on', $('#testedOn').val());
        // Add other form fields as needed

        // AJAX request
        $.ajax({
            url: 'factoryInfo/updateFactory',
            method: 'POST',
            data: formData, // Set the data to the FormData object
            processData: false, // Prevent jQuery from automatically processing the data
            contentType: false, // Prevent jQuery from automatically setting the content type
            success: function(response) {
                console.log(response);
                // Handle success response
            },
            error: function(xhr, status, error) {
                // Handle errors
                console.error(xhr.responseText);
            }
        });
    });
});


//certificateNo

 var incrementValue = 1;

 function generateCertificateNumber() {
     var currentDate = new Date();
     var year = currentDate.getFullYear().toString().substring(2); // Get last two digits of the year
     var month = ('0' + (currentDate.getMonth() + 1)).slice(-2); // Zero-padding for single-digit months
     var day = ('0' + currentDate.getDate()).slice(-2); // Zero-padding for single-digit days

     // Construct the certificate number with the prefix "CE" followed by the auto-incrementing value
     var certificateNumber = "CE" + incrementValue + "-" + day + "-" + month + "-" + year;

     // Display the certificate number
     document.getElementById("certificateNumber").innerHTML = certificateNumber;

     // Increment the auto-incrementing value for the next certificate
     incrementValue++;
     $('#factory_name').focus();
 }

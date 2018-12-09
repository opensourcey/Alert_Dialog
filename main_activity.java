// Alert Dialog for verify mobile number
                AlertDialog.Builder builder;
                AlertDialog alertDialog;

                builder = new AlertDialog.Builder(Login.this);
                builder.setMessage("Verify mobile number is \n"+
                        mCounteryCodeString+" "+mMobileNumberString+" \n\n"+
                        "Do you want to continue?");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Send data Verify_OTP.class
                        Intent intent = new Intent( Login.this, Verify_OTP.class);
                        intent.putExtra("Country_Code", mCounteryCodeString);
                        intent.putExtra( "Mobile_Number", mMobileNumberString);
                        startActivity(intent);
                        //Set new Activity animation
                        overridePendingTransition(R.transition.enter, R.transition.exit);
                    }
                });
                builder.setNegativeButton("EDIT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                alertDialog = builder.create();
                alertDialog.show();

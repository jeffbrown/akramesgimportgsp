package akramesgimportgsp

class BootStrap {

    CustomerService customerService

    def init = { servletContext ->
        customerService.save 'Customer One'
        customerService.save 'Customer Two'
        customerService.save 'Customer Three'
    }
    def destroy = {
    }
}

namespace java com.huawei.wom.provider

struct UserRequest
{
	1:string identitycard
}


struct UserResponse
{
	1:string code
	2:map<string,string> params
}

service ThriftCase
{
	UserResponse integralService(1:UserRequest request)
}

import socket


# Find Domain Name From DNS Pointer (PTR) Records Using IP Address
def get_domain(ip: str):
    return socket.gethostbyaddr(ip)[0]

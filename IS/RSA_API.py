from Crypto.PublicKey import RSA
from Crypto.Cipher import PKCS1_OAEP
import binascii

keyPair = RSA.generate(1024)

pubKey = keyPair.publickey()
pubKeyPEM = pubKey.exportKey()
print("\n",pubKeyPEM.decode('ascii'))

privKeyPEM = keyPair.exportKey()
print("\n",privKeyPEM.decode('ascii'))

msg = b'Pontiac Bandit and Jake Peralta'
encryptor = PKCS1_OAEP.new(pubKey)
encrypted = encryptor.encrypt(msg)
print("\nEncrypted:", binascii.hexlify(encrypted))

decryptor = PKCS1_OAEP.new(keyPair)
decrypted = decryptor.decrypt(encrypted)
print('\nDecrypted:', decrypted)

@echo off
pscp -i %userprofile%\Downloads\myEC2Puty.ppk %userprofile%\Documents\APS\IdentityData\Person.xml  ec2-user@ec2-54-174-19-252.compute-1.amazonaws.com:


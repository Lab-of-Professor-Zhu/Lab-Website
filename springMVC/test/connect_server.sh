#!/bin/bash
ssh -tt computer@10.3.45.68 << remotessh
cd /home/computer/LabWebsite && source activate python3.6 && python test1.py
exit
remotessh
echo done!